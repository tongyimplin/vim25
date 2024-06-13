package com.vmware.vim25;

import com.vmware.vim25.DatastoreSummary;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDatastoreConnectInfo;
import com.vmware.vim25.HostDatastoreExistsConnectInfo;
import com.vmware.vim25.HostDatastoreNameConflictConnectInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreConnectInfo", propOrder = {"summary"})
@XmlSeeAlso({HostDatastoreExistsConnectInfo.class, HostDatastoreNameConflictConnectInfo.class})
public class HostDatastoreConnectInfo extends DynamicData {
  @XmlElement(required = true)
  protected DatastoreSummary summary;
  
  public DatastoreSummary getSummary() {
    return this.summary;
  }
  
  public void setSummary(DatastoreSummary paramDatastoreSummary) {
    this.summary = paramDatastoreSummary;
  }
}
