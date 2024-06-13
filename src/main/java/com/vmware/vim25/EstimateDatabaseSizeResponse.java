package com.vmware.vim25;

import com.vmware.vim25.DatabaseSizeEstimate;
import com.vmware.vim25.EstimateDatabaseSizeResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "EstimateDatabaseSizeResponse")
public class EstimateDatabaseSizeResponse {
  @XmlElement(required = true)
  protected DatabaseSizeEstimate returnval;
  
  public DatabaseSizeEstimate getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(DatabaseSizeEstimate paramDatabaseSizeEstimate) {
    this.returnval = paramDatabaseSizeEstimate;
  }
}
