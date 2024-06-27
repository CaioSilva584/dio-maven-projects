package org.example.caio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class AssumptionsECondicionaisTeste {

    // Assumptions
    @Test
    void validarAlgoSomenteDoCaio(){
        Assumptions.assumeTrue(null == System.getenv("USER"));
        Assertions.assertTrue(10 == 5 + 5);
    }

    // Condicionais
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Caio")
    void validarDeNovo(){
        Assertions.assertTrue(10 == 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "CAio")
    void validarDeNovoAgain(){
        Assertions.assertTrue(10 == 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void permiteSomenteSeForWinOuLinux(){
        Assertions.assertTrue(9 > 0);
    }

    @Test
    @EnabledOnJre({JRE.JAVA_17, JRE.JAVA_22})
    void permiteSomenteSeForJava17Ou22(){
        Assertions.assertTrue(9 > 0);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_22)
    void permiteSomenteSeForEntreJava17e22(){
        Assertions.assertTrue(9 > 0);
    }

}
