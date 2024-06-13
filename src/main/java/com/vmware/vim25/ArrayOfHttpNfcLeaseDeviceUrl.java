package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHttpNfcLeaseDeviceUrl;
import com.vmware.vim25.HttpNfcLeaseDeviceUrl;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHttpNfcLeaseDeviceUrl", propOrder = {"httpNfcLeaseDeviceUrl"})
public class ArrayOfHttpNfcLeaseDeviceUrl {
  @XmlElement(name = "HttpNfcLeaseDeviceUrl")
  protected List<HttpNfcLeaseDeviceUrl> httpNfcLeaseDeviceUrl;
  
  public List<HttpNfcLeaseDeviceUrl> getHttpNfcLeaseDeviceUrl() {
    if (this.httpNfcLeaseDeviceUrl == null)
      this.httpNfcLeaseDeviceUrl = new ArrayList<>(); 
    return this.httpNfcLeaseDeviceUrl;
  }
}
