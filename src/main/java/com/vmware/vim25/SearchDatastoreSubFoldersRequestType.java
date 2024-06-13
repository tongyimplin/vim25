package com.vmware.vim25;

import com.vmware.vim25.HostDatastoreBrowserSearchSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SearchDatastoreSubFoldersRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDatastoreSubFoldersRequestType", propOrder = {"_this", "datastorePath", "searchSpec"})
public class SearchDatastoreSubFoldersRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String datastorePath;
  
  protected HostDatastoreBrowserSearchSpec searchSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDatastorePath() {
    return this.datastorePath;
  }
  
  public void setDatastorePath(String paramString) {
    this.datastorePath = paramString;
  }
  
  public HostDatastoreBrowserSearchSpec getSearchSpec() {
    return this.searchSpec;
  }
  
  public void setSearchSpec(HostDatastoreBrowserSearchSpec paramHostDatastoreBrowserSearchSpec) {
    this.searchSpec = paramHostDatastoreBrowserSearchSpec;
  }
}
