package com.vmware.vim25;

import com.vmware.vim25.CheckForUpdatesResponse;
import com.vmware.vim25.UpdateSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CheckForUpdatesResponse")
public class CheckForUpdatesResponse {
  protected UpdateSet returnval;
  
  public UpdateSet getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(UpdateSet paramUpdateSet) {
    this.returnval = paramUpdateSet;
  }
}
