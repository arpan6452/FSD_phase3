import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicJunitTest {
	@TestFactory
	Collection<DynamicTest> dynamicTestsWithCollection() {
		return Arrays.asList(DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
				DynamicTest.dynamicTest("Multiply Test", () -> assertEquals(4, Math.multiplyExact(2, 2))));
	}
}
