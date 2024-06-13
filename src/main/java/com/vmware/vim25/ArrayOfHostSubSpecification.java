package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSubSpecification;
import com.vmware.vim25.HostSubSpecification;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSubSpecification", propOrder = {"hostSubSpecification"})
public class ArrayOfHostSubSpecification {
  @XmlElement(name = "HostSubSpecification")
  protected List<HostSubSpecification> hostSubSpecification;
  
  public List<HostSubSpecification> getHostSubSpecification() {
    if (this.hostSubSpecification == null)
      this.hostSubSpecification = new ArrayList<>(); 
    return this.hostSubSpecification;
  }
}
