package com.vmware.vim25;

import com.vmware.vim25.AnswerFileValidationInfoStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AnswerFileValidationInfoStatus")
@XmlEnum
public enum AnswerFileValidationInfoStatus {
  SUCCESS("success"),
  FAILED("failed"),
  FAILED_DEFAULTS("failed_defaults");
  
  private final String value;
  
  AnswerFileValidationInfoStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AnswerFileValidationInfoStatus fromValue(String paramString) {
    for (AnswerFileValidationInfoStatus answerFileValidationInfoStatus : values()) {
      if (answerFileValidationInfoStatus.value.equals(paramString))
        return answerFileValidationInfoStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
