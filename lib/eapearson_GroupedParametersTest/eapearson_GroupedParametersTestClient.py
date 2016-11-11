# -*- coding: utf-8 -*-
############################################################
#
# Autogenerated by the KBase type compiler -
# any changes made here will be overwritten
#
############################################################

from __future__ import print_function
# the following is a hack to get the baseclient to import whether we're in a
# package or not. This makes pep8 unhappy hence the annotations.
try:
    # baseclient and this client are in a package
    from .baseclient import BaseClient as _BaseClient  # @UnusedImport
except:
    # no they aren't
    from baseclient import BaseClient as _BaseClient  # @Reimport


class eapearson_GroupedParametersTest(object):

    def __init__(
            self, url=None, timeout=30 * 60, user_id=None,
            password=None, token=None, ignore_authrc=False,
            trust_all_ssl_certificates=False,
            auth_svc='https://kbase.us/services/authorization/Sessions/Login'):
        if url is None:
            raise ValueError('A url is required')
        self._service_ver = None
        self._client = _BaseClient(
            url, timeout=timeout, user_id=user_id, password=password,
            token=token, ignore_authrc=ignore_authrc,
            trust_all_ssl_certificates=trust_all_ssl_certificates,
            auth_svc=auth_svc)

    def validate_contact(self, contact, context=None):
        """
        Functions
        :param contact: instance of type "Contact" -> structure: parameter
           "first_name" of String, parameter "last_name" of String, parameter
           "address" of type "Address" (A pure string test of lists of
           structures (groups)) -> structure: parameter "street_address" of
           String, parameter "city" of String, parameter "state" of String,
           parameter "postal_code" of String, parameter "country" of String,
           parameter "phones" of list of type "Phone" -> structure: parameter
           "phone_type" of String, parameter "phone_number" of String,
           parameter "phone_comments" of String
        :returns: instance of type "TestResults" -> structure: parameter
           "status" of String, parameter "detail" of String
        """
        return self._client.call_method(
            'eapearson_GroupedParametersTest.validate_contact',
            [contact], self._service_ver, context)

    def validate_bug(self, bug, context=None):
        """
        :param bug: instance of type "Bug" -> structure: parameter "title" of
           String, parameter "description" of String, parameter "severity" of
           Long, parameter "effort" of String, parameter "log_entries" of
           list of type "LogEntry" (Throw in floats and ints) -> structure:
           parameter "time_started" of String, parameter "time_spent" of
           Double, parameter "comments" of String
        :returns: instance of type "TestResults" -> structure: parameter
           "status" of String, parameter "detail" of String
        """
        return self._client.call_method(
            'eapearson_GroupedParametersTest.validate_bug',
            [bug], self._service_ver, context)

    def validate_measurement(self, Measurement, context=None):
        """
        :param Measurement: instance of type "Measurement" -> structure:
           parameter "title" of String, parameter "description" of String,
           parameter "measure" of type "Measure" (Measurement We use this to
           test all parameter types.) -> structure: parameter "measure_label"
           of String, parameter "measure_description" of String, parameter
           "measure_int" of Long, parameter "measure_float" of Double,
           parameter "measure_bool" of Long, parameter "measure_type" of
           String
        :returns: instance of type "TestResults" -> structure: parameter
           "status" of String, parameter "detail" of String
        """
        return self._client.call_method(
            'eapearson_GroupedParametersTest.validate_measurement',
            [Measurement], self._service_ver, context)

    def status(self, context=None):
        return self._client.call_method('eapearson_GroupedParametersTest.status',
                                        [], self._service_ver, context)
