package practice.githubactions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorldTest4 {

	@Test
	void echo() {
		EchoWorld4 echoWorld = new EchoWorld4();
		String result = echoWorld.echo("테스트 성공 기원4");
		Assertions.assertThat(result).isEqualTo("테스트 성공 기원4");
	}
}