import de.ait.StringTools;
import jdk.jfr.Name;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToolsTest {
    @Nested
    @Name("Тесты для метода FirstToUpperCase")
     class ForFirstToUpperCaseTests{
        @Test
        public void firstChar_AReturned(){
            assertEquals('A', (StringTools.firstToUpperCase("apple")).charAt(0));
        }
        @Test
        public void firstChar_BReturned(){
            assertEquals('B', (StringTools.firstToUpperCase("banana")).charAt(0));
        }
    }
    @Nested
    @Name("Тесты для метода isStartingFromCapital")
    class ForIsStartingFromCapitalTests{
        @Test
        public void isStartingFromCapitalTrueReturned() {
            assertTrue(StringTools.isStartingFromCapital("Apple"));
        }
        @Test
        public void isStartingFromCapitalFalseReturned() {
            assertFalse(StringTools.isStartingFromCapital("apple"));
        }
    }



}
