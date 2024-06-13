package com.vmware.vim25;

import com.vmware.vim25.ArrayOfIpPool;
import com.vmware.vim25.IpPool;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIpPool", propOrder = {"ipPool"})
public class ArrayOfIpPool {
  @XmlElement(name = "IpPool")
  protected List<IpPool> ipPool;
  
  public List<IpPool> getIpPool() {
    if (this.ipPool == null)
      this.ipPool = new ArrayList<>(); 
    return this.ipPool;
  }
}
