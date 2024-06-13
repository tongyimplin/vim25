package com.vmware.vim25;

import com.vmware.vim25.DvsCreatedEvent;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.FolderEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsCreatedEvent", propOrder = {"parent"})
public class DvsCreatedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected FolderEventArgument parent;
  
  public FolderEventArgument getParent() {
    return this.parent;
  }
  
  public void setParent(FolderEventArgument paramFolderEventArgument) {
    this.parent = paramFolderEventArgument;
  }
}
