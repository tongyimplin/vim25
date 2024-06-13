package com.vmware.vim25;

import com.vmware.vim25.UpdateSet;
import com.vmware.vim25.WaitForUpdatesExResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "WaitForUpdatesExResponse")
public class WaitForUpdatesExResponse {
  protected UpdateSet returnval;
  
  public UpdateSet getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(UpdateSet paramUpdateSet) {
    this.returnval = paramUpdateSet;
  }
}
