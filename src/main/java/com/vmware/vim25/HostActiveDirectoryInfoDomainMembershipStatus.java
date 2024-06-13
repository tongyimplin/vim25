package com.vmware.vim25;

import com.vmware.vim25.HostActiveDirectoryInfoDomainMembershipStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostActiveDirectoryInfoDomainMembershipStatus")
@XmlEnum
public enum HostActiveDirectoryInfoDomainMembershipStatus {
  UNKNOWN("unknown"),
  OK("ok"),
  NO_SERVERS("noServers"),
  CLIENT_TRUST_BROKEN("clientTrustBroken"),
  SERVER_TRUST_BROKEN("serverTrustBroken"),
  INCONSISTENT_TRUST("inconsistentTrust"),
  OTHER_PROBLEM("otherProblem");
  
  private final String value;
  
  HostActiveDirectoryInfoDomainMembershipStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostActiveDirectoryInfoDomainMembershipStatus fromValue(String paramString) {
    for (HostActiveDirectoryInfoDomainMembershipStatus hostActiveDirectoryInfoDomainMembershipStatus : values()) {
      if (hostActiveDirectoryInfoDomainMembershipStatus.value.equals(paramString))
        return hostActiveDirectoryInfoDomainMembershipStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
