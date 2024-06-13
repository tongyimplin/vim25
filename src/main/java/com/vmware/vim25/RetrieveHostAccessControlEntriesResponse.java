package com.vmware.vim25;

import com.vmware.vim25.HostAccessControlEntry;
import com.vmware.vim25.RetrieveHostAccessControlEntriesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveHostAccessControlEntriesResponse")
public class RetrieveHostAccessControlEntriesResponse {
  protected List<HostAccessControlEntry> returnval;
  
  public List<HostAccessControlEntry> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
