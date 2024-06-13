package com.vmware.vim25;

import com.vmware.vim25.EventArgDesc;
import com.vmware.vim25.RetrieveArgumentDescriptionResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveArgumentDescriptionResponse")
public class RetrieveArgumentDescriptionResponse {
  protected List<EventArgDesc> returnval;
  
  public List<EventArgDesc> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
