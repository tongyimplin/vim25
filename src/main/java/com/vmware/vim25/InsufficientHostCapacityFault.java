package com.vmware.vim25;

import com.vmware.vim25.InsufficientHostCapacityFault;
import com.vmware.vim25.InsufficientHostCpuCapacityFault;
import com.vmware.vim25.InsufficientHostMemoryCapacityFault;
import com.vmware.vim25.InsufficientPerCpuCapacity;
import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientHostCapacityFault", propOrder = {"host"})
@XmlSeeAlso({InsufficientPerCpuCapacity.class, InsufficientHostCpuCapacityFault.class, InsufficientHostMemoryCapacityFault.class})
public class InsufficientHostCapacityFault extends InsufficientResourcesFault {
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
