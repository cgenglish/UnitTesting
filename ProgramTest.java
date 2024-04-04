
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test
    public void IsPrime_IsValidPrime_ReturnTrue() {
        //Arrange
        
        //Act
        boolean isPrime = Program.IsPrime(7);

        //Assert
        assertTrue(isPrime);
    }

    @Test
    public void isPrime_ZeroValue_ReturnFalse(){
        //Arrange

        //Act
        boolean isPrime = Program.IsPrime(0);

        //Assert
        assertFalse(isPrime);
    }

    @Test
    public void IsPrime_NotValidPrime_ReturnFalse() {
        //Arrange
        //Act
        boolean isPrime = Program.IsPrime(10);
        //Assert
        assertFalse(isPrime);
    }

    @Test
    public void IsPrime_IsNumber9_ReturnFalse() {
        //Arrange
        //Act
        boolean isPrime = Program.IsPrime(9);
        //Assert
        assertFalse(isPrime);
    }

    @Test //(expected = NullPointerException.class)
    public void Special_Input2023_ThrowException() {
        //Arrange
        //Act
        //Program.Special(2023);
        //Assert is the parameter in the @Test
        //could also be like this
        assertThrows(NullPointerException.class, () -> Program.Special(2023));

    }
}
