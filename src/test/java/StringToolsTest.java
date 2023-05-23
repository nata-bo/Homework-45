import de.ait.StringTools;
import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToolsTest {
    @Nested
    @DisplayName("Тесты для метода FirstToUpperCase")
     class ForFirstToUpperCaseTests{
        @Test
        public void firstChar_AReturned(){
            assertEquals("Apple", (StringTools.firstToUpperCase("apple")));
        }
        @Test
        public void firstChar_BReturned(){
            assertEquals("Banana", (StringTools.firstToUpperCase("banana")));
        }
    }
    @Nested
    @DisplayName("Тесты для метода isStartingFromCapital")
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
