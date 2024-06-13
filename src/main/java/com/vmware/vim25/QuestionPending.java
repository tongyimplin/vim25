package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.QuestionPending;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionPending", propOrder = {"text"})
public class QuestionPending extends InvalidState {
  @XmlElement(required = true)
  protected String text;
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String paramString) {
    this.text = paramString;
  }
}
