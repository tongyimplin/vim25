package com.vmware.vim25;

import com.vmware.vim25.QueryDisksUsingFilterResponse;
import com.vmware.vim25.VirtualDiskId;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryDisksUsingFilterResponse")
public class QueryDisksUsingFilterResponse {
  @XmlElement(required = true)
  protected List<VirtualDiskId> returnval;
  
  public List<VirtualDiskId> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
