package practice.githubactions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorldTest5 {

	@Test
	void echo() {
		EchoWorld5 echoWorld = new EchoWorld5();
		String result = echoWorld.echo("모든 파일을 대상으로 결과를 출력할까?");
		Assertions.assertThat(result).isEqualTo("모든 파일을 대상으로 결과를 출력할까?");
	}
}