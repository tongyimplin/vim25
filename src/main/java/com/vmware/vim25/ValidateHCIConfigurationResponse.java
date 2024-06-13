package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import com.vmware.vim25.ValidateHCIConfigurationResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ValidateHCIConfigurationResponse")
public class ValidateHCIConfigurationResponse {
  protected List<ClusterComputeResourceValidationResultBase> returnval;
  
  public List<ClusterComputeResourceValidationResultBase> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
