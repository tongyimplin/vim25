package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIpPoolAssociation;
import com.vmware.vim25.IpPoolAssociation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIpPoolAssociation", propOrder = {"ipPoolAssociation"})
public class ArrayOfIpPoolAssociation {
  @XmlElement(name = "IpPoolAssociation")
  protected List<IpPoolAssociation> ipPoolAssociation;
  
  public List<IpPoolAssociation> getIpPoolAssociation() {
    if (this.ipPoolAssociation == null)
      this.ipPoolAssociation = new ArrayList<>(); 
    return this.ipPoolAssociation;
  }
}
