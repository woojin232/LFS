package com.LFS.entity;

import java.time.LocalDateTime;

//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
/*
 * 반복되는 날짜 데이터의 공통처리를 담당
 */
//Entity에서 공통적으로 사용될 날짜 필드를 관리할 클래스를 정의한다.
//꼭 날짜가 아니더라도 공통적으로 반복되는 필드를 정의하여 사용해도 된다.
@Getter
// JPA Entity Ŭ�������� BaseTimeEntity�� ����� ��� �ʵ��(createdDate, modifiedDate)�� Į������ �ν��ϵ��� �մϴ�.
@MappedSuperclass
// BaseEntity Ŭ������ Auditing ����� ���Խ�ŵ�ϴ�.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	
	// Entity�� �����Ǿ� ����� �� �ð��� �ڵ� ����ȴ�.
	@CreatedDate
	private LocalDateTime registerTime;
	
	// ��ȸ�� Entity�� ���� ������ �� �ð��� �ڵ� ����ȴ�.
	@LastModifiedDate
	private LocalDateTime	updateTime;
}