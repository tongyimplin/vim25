package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostEventArgument;
import com.vmware.vim25.HostEventArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostEventArgument", propOrder = {"hostEventArgument"})
public class ArrayOfHostEventArgument {
  @XmlElement(name = "HostEventArgument")
  protected List<HostEventArgument> hostEventArgument;
  
  public List<HostEventArgument> getHostEventArgument() {
    if (this.hostEventArgument == null)
      this.hostEventArgument = new ArrayList<>(); 
    return this.hostEventArgument;
  }
}
