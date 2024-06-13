package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.ArrayOfApplyHostProfileConfigurationSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplyHostProfileConfigurationSpec", propOrder = {"applyHostProfileConfigurationSpec"})
public class ArrayOfApplyHostProfileConfigurationSpec {
  @XmlElement(name = "ApplyHostProfileConfigurationSpec")
  protected List<ApplyHostProfileConfigurationSpec> applyHostProfileConfigurationSpec;
  
  public List<ApplyHostProfileConfigurationSpec> getApplyHostProfileConfigurationSpec() {
    if (this.applyHostProfileConfigurationSpec == null)
      this.applyHostProfileConfigurationSpec = new ArrayList<>(); 
    return this.applyHostProfileConfigurationSpec;
  }
}
