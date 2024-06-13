package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangesInfoEventArgument", propOrder = {"modified", "added", "deleted"})
public class ChangesInfoEventArgument extends DynamicData {
  protected String modified;
  
  protected String added;
  
  protected String deleted;
  
  public String getModified() {
    return this.modified;
  }
  
  public void setModified(String paramString) {
    this.modified = paramString;
  }
  
  public String getAdded() {
    return this.added;
  }
  
  public void setAdded(String paramString) {
    this.added = paramString;
  }
  
  public String getDeleted() {
    return this.deleted;
  }
  
  public void setDeleted(String paramString) {
    this.deleted = paramString;
  }
}
