package practice.githubactions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorldTest3 {

	@Test
	void echo() {
		EchoWorld3 echoWorld = new EchoWorld3();
		String result = echoWorld.echo("테스트 성공 기원3");
		Assertions.assertThat(result).isEqualTo("테스트 성공 기원3");
	}
}