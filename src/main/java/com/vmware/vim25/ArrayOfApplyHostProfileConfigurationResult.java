package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationResult;
import com.vmware.vim25.ArrayOfApplyHostProfileConfigurationResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplyHostProfileConfigurationResult", propOrder = {"applyHostProfileConfigurationResult"})
public class ArrayOfApplyHostProfileConfigurationResult {
  @XmlElement(name = "ApplyHostProfileConfigurationResult")
  protected List<ApplyHostProfileConfigurationResult> applyHostProfileConfigurationResult;
  
  public List<ApplyHostProfileConfigurationResult> getApplyHostProfileConfigurationResult() {
    if (this.applyHostProfileConfigurationResult == null)
      this.applyHostProfileConfigurationResult = new ArrayList<>(); 
    return this.applyHostProfileConfigurationResult;
  }
}
