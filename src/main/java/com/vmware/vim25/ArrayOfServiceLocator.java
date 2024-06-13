package com.vmware.vim25;

import com.vmware.vim25.ArrayOfServiceLocator;
import com.vmware.vim25.ServiceLocator;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceLocator", propOrder = {"serviceLocator"})
public class ArrayOfServiceLocator {
  @XmlElement(name = "ServiceLocator")
  protected List<ServiceLocator> serviceLocator;
  
  public List<ServiceLocator> getServiceLocator() {
    if (this.serviceLocator == null)
      this.serviceLocator = new ArrayList<>(); 
    return this.serviceLocator;
  }
}
