package com.referminds.emailservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.referminds.emailservice.entity.Mail;


public interface MailRepository extends CrudRepository<Mail, Long> {

}