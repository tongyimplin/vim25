package com.vmware.vim25;

import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.AnswerFileOptionsCreateSpec;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileOptionsCreateSpec", propOrder = {"userInput"})
public class AnswerFileOptionsCreateSpec extends AnswerFileCreateSpec {
  protected List<ProfileDeferredPolicyOptionParameter> userInput;
  
  public List<ProfileDeferredPolicyOptionParameter> getUserInput() {
    if (this.userInput == null)
      this.userInput = new ArrayList<>(); 
    return this.userInput;
  }
}
