package com.vmware.vim25;

import com.vmware.vim25.AllVirtualMachinesLicensedEvent;
import com.vmware.vim25.Event;
import com.vmware.vim25.HostInventoryFullEvent;
import com.vmware.vim25.HostLicenseExpiredEvent;
import com.vmware.vim25.IncorrectHostInformationEvent;
import com.vmware.vim25.InvalidEditionEvent;
import com.vmware.vim25.LicenseNonComplianceEvent;
import com.vmware.vim25.LicenseRestrictedEvent;
import com.vmware.vim25.LicenseServerAvailableEvent;
import com.vmware.vim25.LicenseServerUnavailableEvent;
import com.vmware.vim25.NoLicenseEvent;
import com.vmware.vim25.ServerLicenseExpiredEvent;
import com.vmware.vim25.UnlicensedVirtualMachinesEvent;
import com.vmware.vim25.UnlicensedVirtualMachinesFoundEvent;
import com.vmware.vim25.VMotionLicenseExpiredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseEvent")
@XmlSeeAlso({LicenseNonComplianceEvent.class, ServerLicenseExpiredEvent.class, LicenseServerAvailableEvent.class, NoLicenseEvent.class, IncorrectHostInformationEvent.class, LicenseServerUnavailableEvent.class, VMotionLicenseExpiredEvent.class, HostLicenseExpiredEvent.class, UnlicensedVirtualMachinesFoundEvent.class, AllVirtualMachinesLicensedEvent.class, InvalidEditionEvent.class, LicenseRestrictedEvent.class, UnlicensedVirtualMachinesEvent.class, HostInventoryFullEvent.class})
public class LicenseEvent extends Event {}
