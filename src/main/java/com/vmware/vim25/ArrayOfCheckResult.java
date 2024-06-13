package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCheckResult;
import com.vmware.vim25.CheckResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCheckResult", propOrder = {"checkResult"})
public class ArrayOfCheckResult {
  @XmlElement(name = "CheckResult")
  protected List<CheckResult> checkResult;
  
  public List<CheckResult> getCheckResult() {
    if (this.checkResult == null)
      this.checkResult = new ArrayList<>(); 
    return this.checkResult;
  }
}
