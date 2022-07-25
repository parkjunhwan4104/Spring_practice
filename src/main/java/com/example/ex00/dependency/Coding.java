package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	
	//	Computer computer; ==> 의존성이 생기는 거
	// Computer computer=new Computer(); ==> 결합성이 단단해져서 new Computer()에 해당하는 것만 사용할 수 있음
	
	
	// 필드 주입
	// 굉장히 편하게 주입할 수 있으나 순환 참조(무한 루프)시 오류가 발생하기 않기 때문에 StackOverFlow가 발생
	// final을 붙일 수 없기 때문에 다른 곳에서 변경 가능(롬복안에 생성자를 초기화 해주므로 final을 붙여도 오류가 안나지만 안붙이는게 맞음, 즉 data 어노테이션이 없어지면 오류가 남)
	// 필드 주입 자체만 사용한다면 final을 붙이면 오류가 나기에 생성자 주입을 해줘야하는데 @data에 생성자 주입이 들어있어서 에러가 안 난다.
	@Autowired //편하게 주입받을 수 있음 new 필요 x
	private final Computer computer; //외부에서 직접 접근하지 않게 하기위해 private, 외부에서 다른 값이 들어오지 않도록 final을 붙임
}
