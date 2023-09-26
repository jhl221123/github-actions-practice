package practice.githubactions;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorldTest {

	@Test
	void echo() {
		EchoWorld echoWorld = new EchoWorld();
		String result = echoWorld.echo("테스트 성공 기원");
		Assertions.assertThat(result).isEqualTo("테스트 성공 기원");
	}
}