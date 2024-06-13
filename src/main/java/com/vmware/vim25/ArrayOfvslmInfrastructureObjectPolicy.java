package com.vmware.vim25;

import com.vmware.vim25.ArrayOfvslmInfrastructureObjectPolicy;
import com.vmware.vim25.VslmInfrastructureObjectPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfvslmInfrastructureObjectPolicy", propOrder = {"vslmInfrastructureObjectPolicy"})
public class ArrayOfvslmInfrastructureObjectPolicy {
  protected List<VslmInfrastructureObjectPolicy> vslmInfrastructureObjectPolicy;
  
  public List<VslmInfrastructureObjectPolicy> getVslmInfrastructureObjectPolicy() {
    if (this.vslmInfrastructureObjectPolicy == null)
      this.vslmInfrastructureObjectPolicy = new ArrayList<>(); 
    return this.vslmInfrastructureObjectPolicy;
  }
}
