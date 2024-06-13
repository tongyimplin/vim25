package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostAccountSpec;
import com.vmware.vim25.HostAccountSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAccountSpec", propOrder = {"hostAccountSpec"})
public class ArrayOfHostAccountSpec {
  @XmlElement(name = "HostAccountSpec")
  protected List<HostAccountSpec> hostAccountSpec;
  
  public List<HostAccountSpec> getHostAccountSpec() {
    if (this.hostAccountSpec == null)
      this.hostAccountSpec = new ArrayList<>(); 
    return this.hostAccountSpec;
  }
}
