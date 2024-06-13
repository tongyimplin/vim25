package com.vmware.vim25;

import com.vmware.vim25.HostTpmAttestationReport;
import com.vmware.vim25.QueryTpmAttestationReportResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryTpmAttestationReportResponse")
public class QueryTpmAttestationReportResponse {
  protected HostTpmAttestationReport returnval;
  
  public HostTpmAttestationReport getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostTpmAttestationReport paramHostTpmAttestationReport) {
    this.returnval = paramHostTpmAttestationReport;
  }
}
