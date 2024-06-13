package com.vmware.vim25;

import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.HostEvent;
import com.vmware.vim25.NASDatastoreCreatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NASDatastoreCreatedEvent", propOrder = {"datastore", "datastoreUrl"})
public class NASDatastoreCreatedEvent extends HostEvent {
  @XmlElement(required = true)
  protected DatastoreEventArgument datastore;
  
  protected String datastoreUrl;
  
  public DatastoreEventArgument getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(DatastoreEventArgument paramDatastoreEventArgument) {
    this.datastore = paramDatastoreEventArgument;
  }
  
  public String getDatastoreUrl() {
    return this.datastoreUrl;
  }
  
  public void setDatastoreUrl(String paramString) {
    this.datastoreUrl = paramString;
  }
}
