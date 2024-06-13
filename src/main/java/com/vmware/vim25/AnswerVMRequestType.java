package com.vmware.vim25;

import com.vmware.vim25.AnswerVMRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerVMRequestType", propOrder = {"_this", "questionId", "answerChoice"})
public class AnswerVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String questionId;
  
  @XmlElement(required = true)
  protected String answerChoice;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getQuestionId() {
    return this.questionId;
  }
  
  public void setQuestionId(String paramString) {
    this.questionId = paramString;
  }
  
  public String getAnswerChoice() {
    return this.answerChoice;
  }
  
  public void setAnswerChoice(String paramString) {
    this.answerChoice = paramString;
  }
}
