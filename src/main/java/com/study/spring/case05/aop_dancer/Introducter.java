package com.study.spring.case05.aop_dancer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class Introducter { // 經紀人
	
	// 將 Performance 及其子類別轉換為 Singer
	@DeclareParents(value = "com.study.spring.case05.aop_dancer.Performance+", 
					defaultImpl = BackSinger.class)
	public Singer singer;
	
	// 將 Performance 及其子類別轉換為 Actor
	@DeclareParents(value = "com.study.spring.case05.aop_dancer.Performance+", 
			defaultImpl = TalkActor.class)
	public Actor actor;

}
