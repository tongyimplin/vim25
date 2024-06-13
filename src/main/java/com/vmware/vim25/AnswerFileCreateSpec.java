package com.vmware.vim25;

import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.AnswerFileOptionsCreateSpec;
import com.vmware.vim25.AnswerFileSerializedCreateSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileCreateSpec", propOrder = {"validating"})
@XmlSeeAlso({AnswerFileOptionsCreateSpec.class, AnswerFileSerializedCreateSpec.class})
public class AnswerFileCreateSpec extends DynamicData {
  protected Boolean validating;
  
  public Boolean isValidating() {
    return this.validating;
  }
  
  public void setValidating(Boolean paramBoolean) {
    this.validating = paramBoolean;
  }
}
