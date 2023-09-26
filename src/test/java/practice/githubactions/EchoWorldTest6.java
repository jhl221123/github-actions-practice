package practice.githubactions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EchoWorldTest6 {

	@Test
	void echo() {
		EchoWorld6 echoWorld = new EchoWorld6();
		String result = echoWorld.echo("모든 파일을 대상으로 결과를 출력할까?6");
		Assertions.assertThat(result).isEqualTo("모든 파일을 대상으로 결과를 출력할까?6");
	}
}