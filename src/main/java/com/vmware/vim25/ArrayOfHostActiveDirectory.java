package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostActiveDirectory;
import com.vmware.vim25.HostActiveDirectory;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostActiveDirectory", propOrder = {"hostActiveDirectory"})
public class ArrayOfHostActiveDirectory {
  @XmlElement(name = "HostActiveDirectory")
  protected List<HostActiveDirectory> hostActiveDirectory;
  
  public List<HostActiveDirectory> getHostActiveDirectory() {
    if (this.hostActiveDirectory == null)
      this.hostActiveDirectory = new ArrayList<>(); 
    return this.hostActiveDirectory;
  }
}
