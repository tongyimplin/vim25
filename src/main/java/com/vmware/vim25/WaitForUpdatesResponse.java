package com.vmware.vim25;

import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.WaitForUpdatesResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "WaitForUpdatesResponse")
public class WaitForUpdatesResponse {
  @XmlElement(required = true)
  protected UpdateSet returnval;
  
  public UpdateSet getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(UpdateSet paramUpdateSet) {
    this.returnval = paramUpdateSet;
  }
}
