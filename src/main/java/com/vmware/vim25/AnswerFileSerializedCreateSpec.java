package com.vmware.vim25;

import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.AnswerFileSerializedCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileSerializedCreateSpec", propOrder = {"answerFileConfigString"})
public class AnswerFileSerializedCreateSpec extends AnswerFileCreateSpec {
  @XmlElement(required = true)
  protected String answerFileConfigString;
  
  public String getAnswerFileConfigString() {
    return this.answerFileConfigString;
  }
  
  public void setAnswerFileConfigString(String paramString) {
    this.answerFileConfigString = paramString;
  }
}
