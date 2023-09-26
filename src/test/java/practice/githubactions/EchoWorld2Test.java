package practice.githubactions;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorld2Test {

	@Test
	void echo() {
		EchoWorld2 echoWorld = new EchoWorld2();
		String result = echoWorld.echo("테스트 성공 기원2");
		Assertions.assertThat(result).isEqualTo("테스트 성공 기원2");
	}

}