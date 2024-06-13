package com.vmware.vim25;

import com.vmware.vim25.GuestAuthenticationChallenge;
import com.vmware.vim25.GuestComponentsOutOfDate;
import com.vmware.vim25.GuestMultipleMappings;
import com.vmware.vim25.GuestOperationsUnavailable;
import com.vmware.vim25.GuestPermissionDenied;
import com.vmware.vim25.GuestProcessNotFound;
import com.vmware.vim25.GuestRegistryFault;
import com.vmware.vim25.InvalidGuestLogin;
import com.vmware.vim25.OperationDisabledByGuest;
import com.vmware.vim25.OperationNotSupportedByGuest;
import com.vmware.vim25.TooManyGuestLogons;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestOperationsFault")
@XmlSeeAlso({GuestPermissionDenied.class, InvalidGuestLogin.class, GuestComponentsOutOfDate.class, TooManyGuestLogons.class, OperationNotSupportedByGuest.class, OperationDisabledByGuest.class, GuestAuthenticationChallenge.class, GuestProcessNotFound.class, GuestMultipleMappings.class, GuestOperationsUnavailable.class, GuestRegistryFault.class})
public class GuestOperationsFault extends VimFault {}
