package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfDeploymentOption;
import com.vmware.vim25.OvfDeploymentOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfDeploymentOption", propOrder = {"ovfDeploymentOption"})
public class ArrayOfOvfDeploymentOption {
  @XmlElement(name = "OvfDeploymentOption")
  protected List<OvfDeploymentOption> ovfDeploymentOption;
  
  public List<OvfDeploymentOption> getOvfDeploymentOption() {
    if (this.ovfDeploymentOption == null)
      this.ovfDeploymentOption = new ArrayList<>(); 
    return this.ovfDeploymentOption;
  }
}
